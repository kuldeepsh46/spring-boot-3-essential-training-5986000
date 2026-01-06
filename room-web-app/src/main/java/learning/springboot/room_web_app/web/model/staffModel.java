package learning.springboot.room_web_app.web.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import learning.springboot.room_web_app.data.entity.positionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class staffModel {
    private UUID id;
    private String fName;
    private String lName;
    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private positionEntity position;

}