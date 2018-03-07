/*
 * Copyright 2018 The Data-Portability Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataportabilityproject.transfer;

import com.google.common.collect.ImmutableList;
import org.dataportabilityproject.spi.transfer.provider.TransferServiceProviderRegistry;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PortabilityTransferServiceProviderRegistryTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void requireImportAndExportTest() {
    // TODO(seehamrun): Update this test based on how you decide to populate service info
    // List<String> supportedImportTypes = ImmutableList.of("photos", "contacts");
    // List<String> supportedExportTypes = ImmutableList.of("contacts");

    // TransferServiceProvider mockTransferProvider = mock(TransferServiceProvider.class);
    // when(mockTransferProvider.getExportTypes()).thenReturn(supportedExportTypes);
    // when(mockTransferProvider.getImportTypes()).thenReturn(supportedImportTypes);
    // when(mockTransferProvider.getServiceId()).thenReturn("mockServiceProvider");

    // thrown.expect(IllegalArgumentException.class);
    // thrown.expectMessage("available for import but not export");

    TransferServiceProviderRegistry registry =
        new PortabilityTransferServiceProviderRegistry(ImmutableList.of("mockServiceProvider"));
  }

  @Test
  public void serviceProviderNotFoundTest() {
    // TODO(seehamrun): Update this test based on how you decide to populate service info
    // TransferServiceProvider mockTransferProvider = mock(TransferServiceProvider.class);
    // when(mockTransferProvider.getServiceId()).thenReturn("mockServiceProvider");

    // thrown.expect(IllegalArgumentException.class);
    // thrown.expectMessage("TransferServiceProvider not found");

    TransferServiceProviderRegistry registry =
        new PortabilityTransferServiceProviderRegistry(ImmutableList.of("ServiceDoesNotExist"));
  }
}