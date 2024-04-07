package kr.ac.hansung.cse.model;

/*
//사용자가 입력한 것을 이 객체에 저장
public class Offer {
    private int id;
    private String name;
    private String email;
    private String text;

    //이렇게 사용하면 무엇이 있는지 파악하기 힘듦, 그래서 lombok을 사용함
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
*/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor //인자없는 contraint를 만
public class Offer {
    private int id;
    private String name;
    private String email;
    private String text;
}
