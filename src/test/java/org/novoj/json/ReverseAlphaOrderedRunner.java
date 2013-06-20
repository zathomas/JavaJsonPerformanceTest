package org.novoj.json;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseAlphaOrderedRunner extends BlockJUnit4ClassRunner {
  public ReverseAlphaOrderedRunner(Class klass) throws InitializationError {
    super(klass);
  }

  @Override
  protected List computeTestMethods() {
    List list = super.computeTestMethods();
    List copy = new ArrayList(list);
    Collections.sort(copy, new Comparator<FrameworkMethod>() {
      public int compare(FrameworkMethod o1, FrameworkMethod o2) {
        return o2.getName().compareTo(o1.getName());
      }
    });
    return copy;
  }
}
