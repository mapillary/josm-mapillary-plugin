package org.openstreetmap.josm.plugins.mapillary;

import org.junit.BeforeClass;
import org.openstreetmap.josm.plugins.mapillary.util.TestUtil;

/**
 * Abstract class for tests that require JOSM's preferences running.
 *
 * @author nokutu
 *
 */
public abstract class AbstractTest {

  private static boolean started = false;

  /**
   * Initiates the basic parts of JOSM.
   */
  @BeforeClass
  public static void setUpBeforeClass() {
    if (!started) {
      TestUtil.initPlugin();
      started = true;
    }
  }
}