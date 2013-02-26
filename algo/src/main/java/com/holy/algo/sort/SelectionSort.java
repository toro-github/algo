package com.holy.algo.sort;

import java.util.Comparator;

/**
 * Selection sort: - start from first element, - and iterate till the end of the
 * element, and find - the small element and swap. - and then move to the next
 * element and repeat until we reach - the end of the element list.
 * 
 * 
 * @author ali
 * 
 */
public class SelectionSort {

	// selection sort
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min]))
					min = j;
			}
			exch(a, i, min);
		}
	}

	// use a custom order and Comparator interface
	public static void sort(Object[] a, Comparator c) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(c, a[j], a[min]))
					min = j;
			}
			exch(a, i, min);
		}
	}

	// is v < w?
	private static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	// is v < w?
	private static boolean less(Comparator c, Object v, Object w) {
		return (c.compare(v, w) < 0);
	}
	
	// exchange a[i] and a[j]
	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static void print(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static boolean isSorted(Comparable[] a){
		return isSorted(a, 0, a.length);
	}
	
	public static boolean isSorted(Comparable[] a, int lo, int hi){
		for(int i=lo+1; i<=hi; i++)
			if(less(a[i], a[i-1])) return false;
		return true;
	}
}
