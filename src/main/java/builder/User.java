package builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private String race;
    private int height;
    private int weight;
    @Singular  private List<String> occupations;
}
