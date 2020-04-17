package micronaut.unwrapped;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Parent {

  private int age;

  @JsonUnwrapped
  private Name name;

  @JsonUnwrapped
  public Name name2;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }
}
