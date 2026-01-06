package learning.springboot.room_web_app.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learning.springboot.room_web_app.service.roomService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.UUID;

import learning.springboot.room_web_app.web.model.rooms;
import org.springframework.web.bind.annotation.PostMapping;



@RestController

public class roomApiController {
    private roomService rs;
    public roomApiController (roomService rs) {
        this.rs = rs;
    }
    
    // @GetMapping()
    @RequestMapping("/api/rooms")
    public List<rooms> getAllRooms() {
        // return new String();
        return this.rs.getAllRooms();
    }
    
    @GetMapping("/api/rooms/{id}")
    public rooms getRoomById(@PathVariable(name = "id") UUID id) {
        // return new String();
        return this.rs.getRoomById(id);
    }

    @PostMapping("api/rooms/add-room")
    @ResponseStatus(HttpStatus.CREATED)
    public rooms addRoom(@RequestBody rooms room) {
        // return new String();
        // this.rs.addRoom(room.getId(), room.getName(), room.getNumber(), room.getInfo());
        return this.rs.addRoom(room);
    }
    @PutMapping()
    // @ResponseStatus(HttpStatus)
    public rooms updateRoom(@PathVariable(name = "id") UUID id, @RequestBody rooms room) {
        // return new String();
        return this.rs.updateRoom(room);
    }
    @DeleteMapping("/{id}")
    public void deleteRoom(@RequestParam UUID id) {
        // return new String();
        this.rs.deleteRoom(id);
    }
    
    
    
}
