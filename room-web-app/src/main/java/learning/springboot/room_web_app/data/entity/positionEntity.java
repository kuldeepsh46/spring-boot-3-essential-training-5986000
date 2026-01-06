package learning.springboot.room_web_app.data.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// @AllArgsConstructor
// @NoArgsConstructor
public enum positionEntity {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;
    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case SECURITY:
                return "Security";
            case FRONT_DESK:
                return "Front Desk";
            case HOUSEKEEPING:
                return "Housekeeping";
        
            default:
                return "";
        }
        
    }
}
