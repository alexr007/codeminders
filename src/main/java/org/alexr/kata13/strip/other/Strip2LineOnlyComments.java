package org.alexr.kata13.strip.other;

import org.alexr.kata13.strip.Patterns;
import org.alexr.kata13.strip.Strip;
import org.alexr.kata13.strip.state.LineState;

/**
 * StripLineOnlyComments implementation
 * removes line comments ONLY
 */
public final class Strip2LineOnlyComments implements Strip, Patterns {
  @Override
  public LineState apply(LineState ls) {
    final int ln_pos = ls.find(LINE);
    return ln_pos >= 0 ?
        ls.saveTo(ln_pos).skipRest() :
        ls.saveRest();
  }
}
