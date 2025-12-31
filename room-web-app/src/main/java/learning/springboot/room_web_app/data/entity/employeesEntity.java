package learning.springboot.room_web_app.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMPLOYEES")
@Data
public class employeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "EMPLOYEE_ID")
    private java.util.UUID employeeId;
    @Column(name = "FIRST_NAME")
    private String fName;
    @Column(name = "LAST_NAME")
    private String lName;
    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private positionEntity position;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return super.toString();
        // return "EMPLOYEE_ID{roomId=" + employeeId + ", FIRST_NAME=" + fName + ", LAST_NAME=" + lName + ", POSITION=" + position + "}";
        return "Employees{employeeId: "+ employeeId +"First Name: "+ fName +"Last Name: "+ lName +"Position: "+ position +"}";
    }
}