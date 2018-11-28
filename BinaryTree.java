public class BinaryTree {
	
	int valor;
	BinaryTree left;
	BinaryTree right;	
	
	public static BinaryTree raiz;
		
	public BinaryTree(int valor) {
		this.valor = valor;
	}
	
	public static void inserir(int valor) {
		inserir(raiz, valor);
	}
	
	public static void inserir(BinaryTree node, int valor){
		if(node != null) {
			if(valor < node.valor) {
				if(node.left != null) {
					inserir(node.left, valor);
				}else {
					System.out.println("  Inserindo " + valor + " a esquerda de " + node.valor);					
					node.left = new BinaryTree(valor); 
				}
			}else if(valor > node.valor) {
				if(node.right != null) {
					inserir(node.right, valor);
				}else {
					System.out.println("  Inserindo " + valor + " a direita de " + node.valor);
					node.right = new BinaryTree(valor);
				}
			}
		}else if(node == null) {
			System.out.println("Raiz " + valor);
			raiz = new BinaryTree(valor);
		}
	}
	
	public static void preordem(BinaryTree node) {
		if (node != null) {
			System.out.print(node.valor + ", ");
			preordem(node.left);
			preordem(node.right);

		}
	}

	public static void posordem(BinaryTree node) {
		if (node != null) {

			posordem(node.left);
			posordem(node.right);
			System.out.print(node.valor + ", ");

		}

	}

	public static void ordem(BinaryTree node) {
		if (node != null) {
			ordem(node.left);
			System.out.print(node.valor + ", ");
			ordem(node.right);

		}
	}
	
	public static void main(String[] args) {			
		inserir(8);
		inserir(3);
		inserir(10);
		inserir(1);
		inserir(6);
		inserir(14);
		inserir(4);
		inserir(7);
		inserir(13);		
		ordem(raiz);
		//posordem(raiz);
		//preordem(raiz);
		
	}

}
