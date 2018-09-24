package realestatekhsolution.models;

import realestatekhsolution.models.bases.BaseEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Rith on 9/23/2018.
 */
@Entity
@Table(name = "sec_user")
public class SecUser extends BaseEntity{
    private String email;

    private String name;

    private String password;

    private String lastName;

    private int active;

    private Set<SecRole> roles;

    public SecUser() {
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Column(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "active")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<SecRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<SecRole> roles) {
        this.roles = roles;
    }

    public SecUser(String email, String name, String password, String lastName, int active, Set<SecRole> roles) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.lastName = lastName;
        this.active = active;
        this.roles = roles;
    }
}
