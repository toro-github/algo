package com.holy.algo.sort;

import java.util.Comparator;

/**
 * MergeSort: - Divide and conqueue method - first copy into a Aux array -
 * divide the array into half and then sort and divide again - and then merge
 * everything back.
 * 
 * @author ali
 * 
 */

public class MergeSortBU {

	// stably merge a[lo...mid] with a[mid+1...hi] using aux[lo..hi]
	private static void merge(Comparable[] a, Comparable[] aux, int lo,
			int mid, int hi) {
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		// copy to aux[]
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		// merge back to a[]
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[i], aux[j]))
				a[k] = aux[i++];
			else
				a[k] = aux[j++];
		}

		assert isSorted(a, lo, hi);
	}

	public static void sort(Comparable[] a) {
		int N = a.length;
		Comparable[] aux = new Comparable[a.length];
		for (int n = 1; n < N; n = n + n) {
			for (int i = 0; i < N - n; i += n + n) {
				int lo = i;
				int m = i + n - 1;
				int hi = Math.min(i + n + n - 1, N - 1);
				merge(a, aux, lo, m, hi);
			}
		}
	}

	private static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	public static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}
