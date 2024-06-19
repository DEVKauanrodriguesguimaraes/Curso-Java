public class metodojava {
    String sample = "  Hello, World!  ";

    // Comprimento da string
    int length = sample.length(); // 16

    // Caractere na posição 1
    char firstChar = sample.charAt(1); // 'H'

    // Substring
    String sub = sample.substring(7, 12); // "World"

    // Remover espaços em branco das extremidades
    String trimmed = sample.trim(); // "Hello, World!"

    // Maiúsculas e minúsculas
    String upper = sample.toUpperCase(); // " HELLO, WORLD! "
    String lower = sample.toLowerCase(); // " hello, world! "

    // Substituir caracteres
    String replaced = sample.replace('!', '?'); // " Hello, World? "

}
