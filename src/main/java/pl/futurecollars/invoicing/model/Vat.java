package pl.futurecollars.invoicing.model;

import java.math.BigDecimal;
import lombok.ToString;

@ToString
public enum Vat {

  VAT_23(23),
  VAT_8(8),
  VAT_5(5),
  VAT_0(0);

  private final BigDecimal rate;

  Vat(int rate) {
    this.rate = BigDecimal.valueOf(rate);
  }
}
