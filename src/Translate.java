import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translate {
	
	public static void main(String[] args) {
		
		//User input sequence
		System.out.print("Enter a sequence: ");
		Scanner sequence_input = new Scanner(System.in);
		String sequence = sequence_input.nextLine();
		
		//Protein
		String protein = "";
		
		//Protein dictionary
		Map<String, String> protein_dict = new HashMap<String, String>();
		protein_dict.put("ATA", "I");
		protein_dict.put("ATC", "I");
		protein_dict.put("ATT", "I");
		protein_dict.put("ATG", "M");
		
		protein_dict.put("ACA", "T");
		protein_dict.put("ACC", "T");
		protein_dict.put("ACG", "T");
		protein_dict.put("ACT", "T");
		
		protein_dict.put("AAC", "N");
		protein_dict.put("AAC", "N");
		protein_dict.put("AAA", "K");
		protein_dict.put("AAG", "K");
		
		protein_dict.put("AGC", "S");
		protein_dict.put("AGT", "S");
		protein_dict.put("AGA", "R");
		protein_dict.put("AGG", "R");
		
		protein_dict.put("CTA", "L"); 
		protein_dict.put("CTC", "L");
		protein_dict.put("CTG", "L");
		protein_dict.put("CTT", "L");
		
		protein_dict.put("CCA", "P");
		protein_dict.put("CCC", "P");
		protein_dict.put("CCG", "P");
		protein_dict.put("CCT", "P");
		
		protein_dict.put("CAC", "H");
		protein_dict.put("CAT", "H");
		protein_dict.put("CAA", "Q");
		protein_dict.put("CAG", "Q");
		
		protein_dict.put("CGA", "R");
		protein_dict.put("CGC", "R");
		protein_dict.put("CGG", "R");
		protein_dict.put("CGT", "R");
		
		protein_dict.put("GTA", "V");
		protein_dict.put("GTC", "V");
		protein_dict.put("GTG", "V");
		protein_dict.put("GTT", "V");
		
		protein_dict.put("GCA", "A");
		protein_dict.put("GCC", "A");
		protein_dict.put("GCG", "A");
		protein_dict.put("GCT", "A");
		
		protein_dict.put("GAC", "D");
		protein_dict.put("GAT", "D");
		protein_dict.put("GAA", "E");
		protein_dict.put("GAG", "E");
		
		protein_dict.put("GGA", "G");
		protein_dict.put("GGC", "G");
		protein_dict.put("GGG", "G");
		protein_dict.put("GGT", "G");
		
		protein_dict.put("TCA", "S");
		protein_dict.put("TCC", "S");
		protein_dict.put("TCG", "S");
		protein_dict.put("TCT", "S");
		
		protein_dict.put("TTC", "F");
		protein_dict.put("TTT", "F");
		protein_dict.put("TTA", "L");
		protein_dict.put("TTG", "L");
		
		protein_dict.put("TAC", "Y");
		protein_dict.put("TAT", "Y");
		protein_dict.put("TAA", "_");
		protein_dict.put("TAG", "_");
		
		protein_dict.put("TGC", "C");
		protein_dict.put("TGT", "C");
		protein_dict.put("TGA", "_");
		protein_dict.put("TGG", "W");
		
		
		//Get the codons
		//Jump by indexes of 3
		for (int i = 0; i < sequence.length(); i=i+3) {
			String codon = sequence.substring(i, Math.min(i+3, sequence.length()));
			//System.out.println(codon);
			
			if (codon.length() == 3) {
				
				protein = protein + protein_dict.get(codon);
				
			}
		}
		
		System.out.println(protein);
			
		}
			
		
}
