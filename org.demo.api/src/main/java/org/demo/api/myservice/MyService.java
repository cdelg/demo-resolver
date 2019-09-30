package org.demo.api.myservice;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface MyService
{
  public double solve(int k);
}
