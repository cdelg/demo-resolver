package org.demo.application.commands;

import org.demo.api.myservice.MyService;
import org.demo.application.annotation.Function;
import org.demo.application.annotation.Scope;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Scope("myservice")
@Function({"run"})
@Component(service = MyServiceCommand.class)
public class MyServiceCommand
{
  @Reference
  private MyService s;

  public void run()
  {
    System.out.println(s.solve(2));
  }
}
