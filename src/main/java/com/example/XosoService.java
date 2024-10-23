package com.example;

import java.util.*;

public class XosoService {
    public Map<String, Set<String>> getNumberInOrder(String input) {
        if (input.length() < 2) input = "00";
        if (input.length() > 5) input = input.substring(5);

        Map<String, Set<String>> results = new HashMap<>();

        String[] numbers4 = input.split(""); // new String[]{"1", "2", "3", "1"};

        if (numbers4.length == 5) {
            System.out.println("Tong hop cua 5 so: " + numbers4[0] + numbers4[1] + numbers4[2] + numbers4[3] + numbers4[4] + " :");

            Set<String> nam_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    for (int k=0; k<numbers4.length; k++) {
                        if (k==i || k==j) continue;
                        for (int h=0; h<numbers4.length; h++) {
                            if (h==i || h==j || h==k) continue;
                            for (int l=0; l<numbers4.length; l++) {
                                if (l==i || l==j || l==k || l==h) continue;
                                nam_cang.add(numbers4[i] + numbers4[j] + numbers4[k] + numbers4[h] + numbers4[l]);
                            }
                        }
                    }
                }
            }
            System.out.println(nam_cang.size() + "  số 5 càng");
            printout(nam_cang);
            results.put("nam_cang", nam_cang);
            System.out.println();

            Set<String> bon_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    for (int k=0; k<numbers4.length; k++) {
                        if (k==i || k==j) continue;
                        for (int h=0; h<numbers4.length; h++) {
                            if (h==i || h==j || h==k) continue;
                            bon_cang.add(numbers4[i] + numbers4[j] + numbers4[k] + numbers4[h]);
                        }
                    }
                }
            }
            System.out.println(bon_cang.size() + "  số 4 càng");
            printout(bon_cang);
            results.put("bon_cang", bon_cang);
            System.out.println();

            Set<String> ba_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    for (int k=0; k<numbers4.length; k++) {
                        if (k==i || k==j) continue;
                        ba_cang.add(numbers4[i] + numbers4[j] + numbers4[k]);
                    }
                }
            }
            System.out.println(ba_cang.size() + "  số 3 càng");
            printout(ba_cang);
            results.put("ba_cang", ba_cang);
            System.out.println();


            Set<String> hai_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    hai_cang.add(numbers4[i] + numbers4[j]);
                }
            }
            System.out.println(hai_cang.size() + "  số 2 càng");
            printout(hai_cang);
            results.put("hai_cang", hai_cang);
        }

        if (numbers4.length == 4) {
            System.out.println("Tong hop cua 4 so: " + numbers4[0] + numbers4[1] + numbers4[2] + numbers4[3] + " :");

            Set<String> bon_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    for (int k=0; k<numbers4.length; k++) {
                        if (k==i || k==j) continue;
                        for (int h=0; h<numbers4.length; h++) {
                            if (h==i || h==j || h==k) continue;
                            bon_cang.add(numbers4[i] + numbers4[j] + numbers4[k] + numbers4[h]);
                        }
                    }
                }
            }
            System.out.println(bon_cang.size() + "  số 4 càng");
            printout(bon_cang);
            results.put("bon_cang", bon_cang);
            System.out.println();

            Set<String> ba_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    for (int k=0; k<numbers4.length; k++) {
                        if (k==i || k==j) continue;
                        ba_cang.add(numbers4[i] + numbers4[j] + numbers4[k]);
                    }
                }
            }
            System.out.println(ba_cang.size() + "  số 3 càng");
            printout(ba_cang);
            results.put("ba_cang", ba_cang);
            System.out.println();


            Set<String> hai_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    hai_cang.add(numbers4[i] + numbers4[j]);
                }
            }
            System.out.println(hai_cang.size() + "  số 2 càng");
            printout(hai_cang);
            results.put("hai_cang", hai_cang);
        }

        if (numbers4.length == 3) {
            System.out.println("Tong hop cua 3 so: " + numbers4[0] + numbers4[1] + numbers4[2] + " :");
            Set<String> ba_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    for (int k=0; k<numbers4.length; k++) {
                        if (k==i || k==j) continue;
                        ba_cang.add(numbers4[i] + numbers4[j] + numbers4[k]);
                    }
                }
            }
            System.out.println(ba_cang.size() + "  số 3 càng");
            printout(ba_cang);
            results.put("ba_cang", ba_cang);
            System.out.println();


            Set<String> hai_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    hai_cang.add(numbers4[i] + numbers4[j]);
                }
            }
            System.out.println(hai_cang.size() + "  số 2 càng");
            results.put("hai_cang", hai_cang);
            printout(hai_cang);
        }

        if (numbers4.length == 2) {
            System.out.println("Tong hop cua 2 so: " + numbers4[0] + numbers4[1] + " :");

            Set<String> hai_cang = new HashSet<>();
            for (int i=0; i<numbers4.length; i++) {
                for (int j=0; j<numbers4.length; j++) {
                    if (i == j) continue;
                    hai_cang.add(numbers4[i] + numbers4[j]);
                }
            }
            System.out.println();
            printout(hai_cang);
            results.put("hai_cang", hai_cang);
        }

        return results;
    }

    private void printout(Set<String> setOfString) {
        Iterator itr = setOfString.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + ",");
        }
    }
}
