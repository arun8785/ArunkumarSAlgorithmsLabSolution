package com.greatelearning.model;

public class SortDenomination {
	public int array[], L[], R[], i;
	public int[] sortArray(int array[], int l, int r) {
		this.array = array;
		if (l < r) {
			int m = l + (r - l) / 2;
			sortArray(array, l, m);
			sortArray(array, m + 1, r);
			conquerArray(array, l, m, r);
			}
		return this.array;
		}
	
	public void conquerArray(int array[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (i = 0; i < n1; ++i) {
			L[i] = array[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = array[m + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}	
}
