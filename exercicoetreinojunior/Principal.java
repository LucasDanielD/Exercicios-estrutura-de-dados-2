package exercicoetreinojunior;

public class Principal {

	public static void main(String[] args) {
		
		
		MyArrayList lista = new MyArrayList();

        System.out.println("Adicionando elementos:");
        lista.addLast(10);
        lista.addLast(20);
        lista.addFirst(5);
        lista.insertAt(2, 15);
        lista.display(); 

        System.out.println("\nTestando Busca e Acesso:");
        System.out.println("Elemento no índice 2: " + lista.get(2));
        System.out.println("Posição do elemento 20: " + lista.find(20));

        System.out.println("\nRemovendo elementos:");
        lista.removeFirst();
        lista.removeLast();
        lista.remove(15);
        lista.display(); 

        System.out.println("\nTestando Redimensionamento:");
        for (int i = 0; i < 10; i++) {
            lista.addLast(i);
        }
        lista.display();
    }
	

}
