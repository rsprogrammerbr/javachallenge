package com.aluracursos.conversordemoedas;

import java.util.Map;

public record Moeda(Map<String, Double> conversion_rates) {
}
