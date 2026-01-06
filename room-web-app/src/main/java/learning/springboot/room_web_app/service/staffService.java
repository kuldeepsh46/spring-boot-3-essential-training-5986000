package learning.springboot.room_web_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.RequestParam;

import learning.springboot.room_web_app.data.entity.employeesEntity;
import learning.springboot.room_web_app.data.repository.employeesRepository;
import learning.springboot.room_web_app.web.model.staffModel;

@Service
public class staffService {  // ← Class name OK
    private final employeesRepository er;

    public staffService(employeesRepository er) {  // ← Constructor OK
        this.er = er;
    }
    public List<staffModel> getAllStaffMembers() {
        List<employeesEntity> allStaffMembers = this.er.findAll();
        List<staffModel> emps = new ArrayList<>(allStaffMembers.size());
        allStaffMembers.forEach(sm->emps.add(new staffModel(sm.getEmployeeId(), sm.getFName(), sm.getLName(), sm.getPosition())));
        return emps;
    }
    public staffModel getStaffMemberById (UUID id) {
        Optional<employeesEntity> entity = this.er.findById(id);
        if (entity.isEmpty()) {
            return null;
        } else {
            return this.getFromEntity(entity.get());
        }
    }
    public staffModel addMember (staffModel sm) {
        employeesEntity entity = this.getEmployeeFromStaffMember(sm);
        entity = this.er.save(entity);
        return this.getFromEntity(entity);
    }
    public staffModel updateModel (staffModel sm) {
        employeesEntity entity = this.getEmployeeFromStaffMember(sm);
        entity = this.er.save(entity);
        return this.getFromEntity(entity);
    }
    public void deleteById (UUID id) {
        this.er.deleteById(id);
    }



    private staffModel getFromEntity (employeesEntity re) {
        return new staffModel(re.getEmployeeId(), re.getFName(), re.getLName(), re.getPosition());
    }
    private employeesEntity getEmployeeFromStaffMember (staffModel sm) {
        return new employeesEntity(sm.getId(), sm.getFName(), sm.getLName(), sm.getPosition());
    }
}
