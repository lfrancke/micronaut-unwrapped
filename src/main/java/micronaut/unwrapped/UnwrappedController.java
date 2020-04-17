package micronaut.unwrapped;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class UnwrappedController {

  @Get("/1")
  public Parent unwrap() {
    Name name1 = new Name();
    name1.first = "foo";
    name1.last = "bar";

    Name name2 = new Name();
    name2.first = "public";
    name2.last = "field";

    Parent parent = new Parent();
    parent.setName(name1);
    //parent.name2 = name2;
    parent.setAge(20);

    return parent;
  }

  @Get("/2")
  public Parent2 unwrap2() {
    Name name1 = new Name();
    name1.first = "foo";
    name1.last = "bar";

    Name name2 = new Name();
    name2.first = "public";
    name2.last = "field";

    Parent2 parent = new Parent2();
    parent.setName(name1);
    parent.name2 = name2;
    parent.setAge(20);

    return parent;
  }

}
