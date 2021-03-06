package entity;

import javax.persistence.*;

@Entity
@Table(name="KULLANICI")
public class User {

    @SequenceGenerator(name = "generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String name;

    @Column(name="SOYADI", nullable = false, length = 50)
    private String surname;

    @Column(name="EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name="TELEFON", nullable = false, length = 50)
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", adi='" + name + '\'' +
                ", soyadi='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + phoneNumber + '\'' +
                '}';
    }

}
