/*
 * Copyright 2014 The Error Prone Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.errorprone.refaster.testdata;

import java.util.Random;

/**
 * Test input for {@code BinaryTemplate}.
 * 
 * @author lowasser@google.com (Louis Wasserman)
 */
class BinaryTemplateExample {
  public void example(int x, int y) {
    // positive examples
    System.out.println((0xFF + 5) >> 1);
    System.out.println(((x + y) >> 1) + 20);
    System.err.println((y + new Random().nextInt()) >> 1);
    // negative examples
    System.out.println((x + y /* signed division */) / 2 + 20);
    System.out.println(x + y / 2);
    System.out.println((x - y) / 2);
    System.out.println((x * y) / 2);
    System.out.println((x + y) / 3);
    System.out.println((x + 5L) / 2);
  }
}
