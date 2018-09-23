package realestatekhsolution.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Rith on 9/23/2018.
 */
@Entity
@Table(name = "sec_user")
public class SecUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "active")
    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<SecRole> roles;

    public SecUser() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

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
