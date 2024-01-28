export type AutobusModel = {
  id: number,
  przebieg: number,
  rokProdukcji: number,
  model: string,
  mocNetto: number,
  zasieg: number,
  iloscMiejsc: number,
  iloscPakietowZasilajacych?: number,
  poziomNaladowania?: number
}
