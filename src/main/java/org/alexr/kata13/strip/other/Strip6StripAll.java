package org.alexr.kata13.strip.other;

import org.alexr.kata13.strip.Strip;
import org.alexr.kata13.strip.state.LineState;

/**
 * StripAll implementation
 * just throws everything
 */
public final class Strip6StripAll implements Strip {
  @Override
  public LineState apply(LineState ls) {
    return ls.skipRest();
  }
}
