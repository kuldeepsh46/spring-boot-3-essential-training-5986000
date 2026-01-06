package learning.springboot.room_web_app.web.api;

import org.springframework.web.bind.annotation.RestController;

import learning.springboot.room_web_app.service.staffService;
import learning.springboot.room_web_app.web.model.staffModel;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class staffApiController {
    private final staffService ss;
    public staffApiController(staffService ss) {
        this.ss = ss;
    }

    @RequestMapping("/api/staff")
    public List<staffModel> getAllStaffMembers() {
        // return this.ss.getAllStaffMembers();
        return this.ss.getAllStaffMembers();
    }

    @GetMapping("api/staff/{id}")
    public staffModel getStaffById(@RequestParam(name = "id") UUID id) {
        return this.ss.getStaffMemberById(id);
        // return new String();
    }
    @PostMapping("api/staff/add-member")
     @ResponseStatus(HttpStatus.CREATED)
    public staffModel addMember(@RequestBody staffModel entity) {
        return this.ss.addMember(entity);
    }
    @PutMapping("api/staff/{id}")
    public staffModel updateMember(@PathVariable(name = "id") UUID id, @RequestBody staffModel entity) {
        //TODO: process PUT request
        
        return this.ss.updateModel(entity);
    }
    @DeleteMapping("api/staff/delete-member")
    public void deleteMember(@RequestParam(name = "id") UUID id) {
        this.ss.deleteById(id);
    }
    
}
