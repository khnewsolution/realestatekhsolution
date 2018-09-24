package realestatekhsolution.models;

import realestatekhsolution.models.bases.BaseEntity;

import javax.persistence.*;

/**
 * Created by Rith on 9/23/2018.
 */
@Entity
@Table(name = "sec_role")
public class SecRole extends BaseEntity {

    @Column(name = "role")
    private String role;

    public SecRole() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SecRole(String role) {
        this.role = role;
    }
}
