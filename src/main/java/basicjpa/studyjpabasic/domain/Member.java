package basicjpa.studyjpabasic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Member {


    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "delivery")
    private List<Order> orderList = new ArrayList<>();

    private String name;

    private String city;

    private String street;

    private String zipcode;


}

