package micronaut.unwrapped;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

  public static void main(String[] args) throws JsonProcessingException {
    Name name1 = new Name();
    name1.first = "foo";
    name1.last = "bar";

    Name name2 = new Name();
    name1.first = "public";
    name1.last = "field";

    Parent parent = new Parent();
    parent.setName(name1);
    parent.name2 = name2;
    parent.setAge(20);

    ObjectMapper mapper = new ObjectMapper();
    String value = mapper.writeValueAsString(parent);
    System.out.println(value);
  }

}
