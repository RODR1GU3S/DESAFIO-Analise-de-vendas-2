package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Sale;

public class Análise_de_vendas_II {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o caminho do arquivo: "); // Exemplo: G:\\Eclipse\\base-de-dados.csv
		String path = sc.nextLine();
		
		try (Stream<String> lines = Files.lines(Path.of(path))) {
			
			List<Sale> list = lines                       // Estrutura; Interface List<E> para evita reabrir o arquivo ou duplicar leitura
			        .map(line -> line.split(","))
			        .map(partes -> new Sale(
			            Integer.parseInt(partes[0]),
			            Integer.parseInt(partes[1]),
			            partes[2],
			            Integer.parseInt(partes[3]),
			            Double.parseDouble(partes[4])
			        ))
			        .collect(Collectors.toList());
			
			Map<String, Double> totalSeller = list.stream()
					.collect(Collectors.groupingBy(
							Sale::getSeller,
							Collectors.summingDouble(Sale::getTotal)));
			
			System.out.println("\nTotal de vendas por vendedor:");
			totalSeller.forEach((vendedor, total) ->
		        System.out.printf("%s - R$ %.2f%n", vendedor, total));
		}
		catch (NoSuchFileException e) {
			System.out.println("Erro: "  + e.getMessage() + " (O sistema não pode encontrar o arquivo especificado)");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
/*                                    >>>>>     Observação:     <<<<<

	Poderia ter usado a Interface Map<K,V>, conforme a seguir:

	 Para essa Primeira solicitação;
	  'Depois de ler os dados, seu programa deverá mostrar o total vendido por cada vendedor conforme exemplo'

	 Porém a Segunda solicitação;
	  'Atenção: seu programa é que deve varrer toda a lista para encontrar os nomes dos vendedores.'


try (Stream<String> lines = Files.lines(Path.of(path))) {

            Map<String, Double> totalSaller = lines
                .map(line -> line.split(","))
                .collect(Collectors.groupingBy(
                    partes -> partes[2], // Vendedor
                    Collectors.summingDouble(partes -> Double.parseDouble(partes[4])) // Total
                ));
           ...
*/
