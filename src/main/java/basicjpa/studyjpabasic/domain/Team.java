package basicjpa.studyjpabasic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private long id;

    private String name;

    @OneToMany(mappedBy = "")
    private List<Member> members = new ArrayList<>();


}
