void main() {
    String s1 = " Informática ";
    String s2 = " Edificações ";
    String s3 = " Informática ";
    IO.println("s1 e s2 são iguais? " + s1.equals(s2) );
    IO.println("s1 e s3 são iguais? " + s1.equals(s3) );
    IO.println("========================================");
    IO.println("Tamanho de s1: " + s1.length());
    IO.println("========================================");
    IO.println("Caracter de índice 5 em s1: " + s1.charAt(5));
    IO.println("========================================");
    IO.println("s1 em maiúsculas: " + s1.toUpperCase());
    IO.println("========================================");
    IO.println("s1 em minúsculas: " + s1.toLowerCase());
    IO.println("========================================");
    IO.println("trim de s1:" + s1.trim());
    IO.println("========================================");
    IO.println("Substituir parte de s1: " + s1.replace("Infor", "INFOR"));
    IO.println("========================================");
    IO.println("Parte de s1: " + s1.substring(6));
    IO.println("Parte de s1: " + s1.substring(1, 12));
    IO.println("=".repeat(40));
}
