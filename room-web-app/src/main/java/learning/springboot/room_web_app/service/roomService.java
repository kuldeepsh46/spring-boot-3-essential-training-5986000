package learning.springboot.room_web_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import learning.springboot.room_web_app.data.entity.roomEntity;
import learning.springboot.room_web_app.data.repository.roomRepository;
import learning.springboot.room_web_app.web.model.rooms;

@Service
public class roomService {
    private final roomRepository rmRepo;
    public roomService (roomRepository rmRepo) {
        this.rmRepo = rmRepo;
    }
    public List<rooms> getAllRooms() {
        // return null;
        List<roomEntity> allRooms = this.rmRepo.findAll();
        List<rooms> roomsArrList = new ArrayList<>(allRooms.size());
        allRooms.forEach(r->roomsArrList.add(new rooms(r.getRoomId(), r.getName(), r.getNumber(), r.getBedInfo())));
        return roomsArrList;
    }
    public rooms getRoomById(UUID id) {
        // return null;
        Optional<roomEntity> entity = this.rmRepo.findById(id);
        if (entity.isEmpty()) {
            return null;
        } else {
            return this.getRoomFromEntity(entity.get());
        }
    }
    public rooms addRoom(rooms r) {
        // return null;
        roomEntity entity = this.getRoomEntityFromRoom(r);
        entity = this.rmRepo.save(entity);
        return this.getRoomFromEntity(entity);
    }
    public rooms updateRoom(rooms r) {
        // return null;
        roomEntity entity = this.getRoomEntityFromRoom(r);
        entity = this.rmRepo.save(entity);
        return this.getRoomFromEntity(entity);
    }
    public void deleteRoom(UUID id) {
        this.rmRepo.deleteById(id);
        // return this.getAllRooms();
        
    }

    private rooms getRoomFromEntity (roomEntity re) {
        return new rooms(re.getRoomId(), re.getName(), re.getNumber(), re.getBedInfo());
    }
    private roomEntity getRoomEntityFromRoom (rooms r) {
        return new roomEntity(r.getId(), r.getName(), r.getNumber(), r.getInfo());
    }
}
