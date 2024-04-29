import java.util.ArrayList;
import java.util.List;

public class Lista{
    // variáveis de instância
    private Node inicio, fim;
   
    /**
     * Construtor para objetos da classe Lista
     */
    public Lista(){
        inicio = fim = null;
    }
    public <T> T buscarElemento(int x){
        Node aux = inicio;
        while(aux != null){
            if (x == aux.getX()){
               
                return (T) Integer.valueOf(aux.getX()); 
            }
            aux = aux.getProx();
        }
        return null; 
    }



    public void insercaoPorPosicao(int pos, int valor){
              Node  aux = inicio;
              int  i = 0;
              int proximo;
              while(aux!=null){
                     aux.getX();
                     if( i == pos-1 ){

                          aux.getProx();
                          
                          aux.setProx(new Node(valor));
                          while(aux!=null){
                          proximo = aux.getX();
                          aux.getProx().setProx(new Node(proximo));
                          }
                                  
                          
                     }
                     aux.getProx();
                     i++;
              }
    }


    public void remocaoPosicao(int pos){
        Node  aux = inicio;
        int  i = 0;
        Node value  = null;
        
        while(aux!=null){
               aux.getX();
               if( i == pos-1){
                      
                      value = aux.getProx();
                        value.setProx(null);
                        value = aux.getProx();     
                           
                            
                    
               }
               aux.getProx();
               i++;
        }
}

   public void inversaoLista(){
     Node atual = inicio;
     Node anterior = null;
     Node proximo;

    while (atual != null) {
        proximo = atual.getProx(); 
        atual.setProx(anterior); 

       
        anterior = atual;
        atual = proximo;
    }

    
    inicio = anterior;

   }
    public void addFim(int x){
        if(inicio==null){
            inicio = new Node(x);
            fim = inicio;
        }
        else{
            fim.setProx(new Node(x));
            fim = fim.getProx();
        }

        numeros.add(fim.getX());
    }

    public int menor(){
        Node aux = inicio;
        int menor = aux.getX();
                 while(aux!=null){
                      aux = aux.getProx();
                     if(aux.getX() < menor ){
                          menor = aux.getX();
                     }
                 }
                 return menor;   
    } 
          public int maior(){
            Node aux = inicio;
            int maior = aux.getX();
                     while(aux!=null){
                          aux = aux.getProx();
                         if(aux.getX() > maior ){
                              maior = aux.getX();
                         }
                     }
                     return maior;   
          }
     public int soma(){
        Node aux = inicio;
        int soma = 0;
                 while(aux!=null){
                     soma+=aux.getX();
                     aux = aux.getProx();
                      
                 }
                 return soma;   
     }
    public int lenght(){
        Node aux = inicio;
        int i = 0;
                 while(aux!=null){
                       aux.getX();
                     aux = aux.getProx();
                      i++;
                 }
                 return i;
    }
    public void addInicio(int x){
        if(inicio==null){
            inicio = new Node(x);
            fim = inicio;
         
        }
        else{
            Node novo = new Node(x);
            novo.setProx(inicio);
             inicio = novo;
           
           
        }

        
    }
    
    public int removeInicio(){
        Node aux = inicio;
        if(aux !=null ){
            inicio = inicio.getProx();
             
            return aux.getX();
        }
        else{
            System.out.println("Tentativa de remoção de lista vazia");
            return -99999;
        }
        
         
    }

    public int removeFim(){
         Node  atual = inicio;
          Node anterior = null;

          while(atual.getProx()!=null){
                  anterior =atual;
                  atual = atual.getProx();
                 
          }

          int valorRemovido = atual.getX(); 

    if (anterior == null) { 
        inicio = null; 
        fim = null; 
    } else {
        anterior.setProx(null);
        fim = anterior; 
    }

    return valorRemovido;
    }
    
    public void show(){
        Node aux = inicio;
        while(aux!=null){
            System.out.println(aux.getX());
            aux = aux.getProx();
        }

        
    }

  
}





