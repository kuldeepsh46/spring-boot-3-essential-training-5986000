package learning.springboot.room_web_app.web.controller;

// import java.util.ArrayList;
// import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// import learning.springboot.room_web_app.data.entity.roomEntity;
// import learning.springboot.room_web_app.data.repository.roomRepository;
import learning.springboot.room_web_app.service.roomService;
// import learning.springboot.room_web_app.web.model.rooms;


@Controller
@RequestMapping("/rooms")
public class roomController {
    // private final roomRepository roomRepo;
    // public roomController(roomRepository roomRepo) {
    //     this.roomRepo = roomRepo;
    // }
    private final roomService rs;
    public roomController(roomService rs) {
        this.rs = rs;
    }

    @GetMapping("")
    public String getRoomPage(Model m) {
        // return new String();
        // List<roomEntity> re = this.roomRepo.findAll();
        // List<rooms> rooms = new ArrayList<>(re.size());
        // re.forEach(e->rooms.add(new rooms(e.getRoomId(), e.getName(), e.getNumber(), e.getBedInfo())));

        m.addAttribute("rooms", this.rs.getAllRooms());
        // List<roomEntity> re = roomRepo.findAll();
        return "rooms";
    }
    
}
