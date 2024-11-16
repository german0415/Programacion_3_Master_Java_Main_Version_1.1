package co.edu.umanizales.kids_list.service;

import co.edu.umanizales.kids_list.model.BST;
import co.edu.umanizales.kids_list.model.Kid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSTService {
    private final BST bst;

    public BSTService() {
        this.bst = new BST(); // Inicializa el árbol binario
    }

    // Agregar un niño al árbol
    public void addKid(Kid kid) {
        bst.insert(kid);
    }

    // Mostrar todos los niños en orden
    public List<Kid> showKids() {
        return bst.inOrder();
    }

    // Eliminar un niño por su ID
    public void removeKidById(int id) {
        bst.delete(id);
    }

    // Método para obtener los niños con hijos
    public List<Kid> getKidsWithChildren() {
        return bst.prune();
    }
}
