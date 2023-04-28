package controller;

public class QuickController {
		public int[] quicksort(int[] vt,int inicio,int fim) {
			if(fim>inicio) {
				int PosicaoFixa = dividir(vt,inicio,fim);
				quicksort(vt, inicio, PosicaoFixa-1);
				quicksort(vt,PosicaoFixa+1,fim);
			}
			return vt;
		}
		public int dividir(int[] vt,int inicio,int fim) {
			int ponteiroEsquerda = inicio+1;
			int ponteiroDireita = fim;
			int pivo=vt[inicio];
			
			while(ponteiroEsquerda <= ponteiroDireita) {
				while(ponteiroEsquerda<=ponteiroDireita && vt[ponteiroEsquerda]<=pivo) {
					ponteiroEsquerda++;
				}
				while(ponteiroDireita >= ponteiroEsquerda && vt[ponteiroDireita]>pivo) {
					ponteiroDireita--;
				}
				if(ponteiroEsquerda < ponteiroDireita) {
					trocar(vt, ponteiroEsquerda, ponteiroDireita);
					ponteiroEsquerda++;
					ponteiroDireita--;
				}
			}
			trocar(vt,inicio,ponteiroDireita);
			return ponteiroDireita;

		}
		public void trocar(int[] vt, int i, int j) {
			int aux = vt[j];
			vt[j] = vt[i];
			vt[i] = aux;	
		}

	}


