void main() {
    String texto = "";
    IO.println("INÍCIO");
    long tempoInicial = System.currentTimeMillis();
    for (int i = 1; i < 100001; i++) {
        texto += i + " ";
    }
    long tempoFinal = System.currentTimeMillis();
    IO.println("FIM");
    IO.println("Tempo gasto = " + (tempoFinal - tempoInicial) );
}