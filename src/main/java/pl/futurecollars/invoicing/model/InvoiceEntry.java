package pl.futurecollars.invoicing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InvoiceEntry {

  private String description;
  private Double price;
  private Double vatValue;
  private Vat vatRate;

}
