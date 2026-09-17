void main() {
    StringBuilder texto = new StringBuilder();
    IO.println("INÍCIO");
    long tempoInicial = System.currentTimeMillis();
    for (int i = 1; i < 100001; i++) {
        texto.append(i);
        texto.append(" ");
    }
    long tempoFinal = System.currentTimeMillis();
    IO.println("FIM");
    IO.println("Tempo gasto = " + (tempoFinal - tempoInicial) );
}