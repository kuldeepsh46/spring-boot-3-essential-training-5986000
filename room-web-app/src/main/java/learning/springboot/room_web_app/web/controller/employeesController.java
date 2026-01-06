package learning.springboot.room_web_app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import learning.springboot.room_web_app.service.staffService;

@Controller
@RequestMapping("/staff")
public class employeesController {
    private final staffService ss;

    public employeesController(staffService ss) {
        this.ss = ss;
    }
    @GetMapping("")
    public String getStaffPage(Model m) {
        // List<employeesEntity> getAllStaff = this.er.findAll();
        // // System.out.print(getAllStaff);
        // List<staffModel> emps = new ArrayList<>(getAllStaff.size());
        // getAllStaff.forEach(e->emps.add(new staffModel(e.getEmployeeId(), e.getFName(), e.getLName(), e.getPosition())));
        // System.out.print(emps);
        // re.forEach(e->rooms.add(new rooms(e.getRoomId(), e.getName(), e.getNumber(), e.getBedInfo())));
        m.addAttribute("employees", this.ss.getAllStaffMembers());
        return "employees";
    }
}
