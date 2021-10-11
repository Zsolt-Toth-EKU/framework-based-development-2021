package hu.ekcu.inf.framework.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity()
@Table(name = "players")
public class PlayerEntity {

    @Id
    @Column(name="bioID")
    private String bioId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name="middleName")
    private String middleName;

    @Column(name="lastName")
    private String lastName;

    @Column(name = "pos")
    private String pos;

    @Column
    private int height;

    @Column
    private int weight;
}
