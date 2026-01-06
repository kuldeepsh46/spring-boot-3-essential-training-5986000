package learning.springboot.room_web_app.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class rooms {
    private UUID id;
    private String name;
    private String number;
    private String info;
}
