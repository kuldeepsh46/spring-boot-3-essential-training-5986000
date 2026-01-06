package learning.springboot.room_web_app.data.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
// import lombok.Data;
import lombok.Setter;

@Entity
@Table(name="ROOMS")
// @Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class roomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="ROOM_ID")
    private java.util.UUID roomId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NUMBER")
    private String number;
    @Column(name = "BED_INFO")
    private String bedInfo;
    // public roomEntity(UUID id, String name2, String number2, String info) {
    //     //TODO Auto-generated constructor stub
    // }
    @Override
    public String toString() {
        return "roomEntity{roomId=" + roomId + ", name=" + name + ", number=" + number + ", bedInfo=" + bedInfo + "}";
    }
}
