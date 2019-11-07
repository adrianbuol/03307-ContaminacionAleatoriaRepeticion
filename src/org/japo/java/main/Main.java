/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

//           Constantes
        final double MCG_MAX = 700;
        final double MCG_MIN = 0;
        final int estaciones = 4;

// Bucle seria for cuando el numero de repeticiones esta delimitado previamente
        for (int i = 1; i <= estaciones; i++) {
            double cont = RND.nextDouble() * (MCG_MAX - MCG_MIN) + MCG_MIN;
            System.out.printf(Locale.ENGLISH, "Estación %d ...: %.2f mcg N02 %n",
                    i, cont);

        }
        System.out.println("END");
    }
}
