package com.company;

public interface CaracteristicasLibros {
    final String CARACTERISTICAS_ACADEMICO="Impartir Conocimiento A traves de metodos " +
            "probados y explicaciones para alcanzar el conocimiento esperado";
    final String CARACTERISTICAS_NOVELA="Narración en prosa, generalmente extensa, que cuenta " +
            "una historia de ficción o con un desarrollo más completo en cuanto al argumento y los personajes, que los relatos breves o cuentos.";
    final String CARACTERISTICAS_HISTORIETA="Relato o historia explicada mediante viñetas o recuadros que contienen ilustraciones y en el que " +
            "algunas o todas las viñetas pueden contener un texto más o menos breve.";
    final String CARACTERISTICAS_ARTICULO="Texto escrito que tiene entidad propia y se publica junto a otros textos en un periódico, en una revista " +
            "o en un libro.";

    public String tipoCaracteristica();
}
