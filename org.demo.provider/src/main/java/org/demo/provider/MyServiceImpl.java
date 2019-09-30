package org.demo.provider;

import org.demo.api.myservice.MyService;
import org.osgi.service.component.annotations.Component;

@Component
public class MyServiceImpl implements MyService
{
  @Override
  public double solve(int k)
  {
    return k * 2;
  }
}
