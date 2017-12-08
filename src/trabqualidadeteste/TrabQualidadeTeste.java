package trabqualidadeteste;

public class TrabQualidadeTeste {

    public static void main(String[] args) {
        int key = 5;
        int[] itens = {1,2,5,6,8};
        int size = itens.length;
        boolean ascending = false;
        SearchType type = SearchType.Equals;
        ResultType result = new ResultType();
        result.ReturnType(ResultType.SearchResult.NotFound, null, null);
        
        BuscaVetor.busca(type, itens, size, key, result, ascending);
        System.out.println(type);
        System.out.println(result);
        System.out.println("Crescente? "+ascending);
    }
}
