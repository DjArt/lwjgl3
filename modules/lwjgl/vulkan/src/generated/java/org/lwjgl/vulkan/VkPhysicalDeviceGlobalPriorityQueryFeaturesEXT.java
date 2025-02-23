/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing whether global priority query can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTGlobalPriorityQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #globalPriorityQuery};
 * }</code></pre>
 */
public class VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GLOBALPRIORITYQUERY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GLOBALPRIORITYQUERY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the ability to query global queue priorities. */
    @NativeType("VkBool32")
    public boolean globalPriorityQuery() { return nglobalPriorityQuery(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTGlobalPriorityQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType$Default() { return sType(EXTGlobalPriorityQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #globalPriorityQuery} field. */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT globalPriorityQuery(@NativeType("VkBool32") boolean value) { nglobalPriorityQuery(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT set(
        int sType,
        long pNext,
        boolean globalPriorityQuery
    ) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT set(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #globalPriorityQuery}. */
    public static int nglobalPriorityQuery(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.GLOBALPRIORITYQUERY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #globalPriorityQuery(boolean) globalPriorityQuery}. */
    public static void nglobalPriorityQuery(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.GLOBALPRIORITYQUERY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#globalPriorityQuery} field. */
        @NativeType("VkBool32")
        public boolean globalPriorityQuery() { return VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nglobalPriorityQuery(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#sType} field. */
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTGlobalPriorityQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT} value to the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#sType} field. */
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer sType$Default() { return sType(EXTGlobalPriorityQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#globalPriorityQuery} field. */
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nglobalPriorityQuery(address(), value ? 1 : 0); return this; }

    }

}