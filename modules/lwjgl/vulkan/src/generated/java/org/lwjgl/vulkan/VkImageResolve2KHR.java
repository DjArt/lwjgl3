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
 * Structure specifying an image resolve operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> only contain {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * <li>{@code dstSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}, {@link VkResolveImageInfo2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageResolve2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #srcSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #srcOffset};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #dstSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #dstOffset};
 *     {@link VkExtent3D VkExtent3D} {@link #extent};
 * }</code></pre>
 */
public class VkImageResolve2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBRESOURCE,
        SRCOFFSET,
        DSTSUBRESOURCE,
        DSTOFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBRESOURCE = layout.offsetof(2);
        SRCOFFSET = layout.offsetof(3);
        DSTSUBRESOURCE = layout.offsetof(4);
        DSTOFFSET = layout.offsetof(5);
        EXTENT = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkImageResolve2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageResolve2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** {@code srcSubresource} and {@code dstSubresource} are {@link VkImageSubresourceLayers} structures specifying the image subresources of the images used for the source and destination image data, respectively. Resolve of depth/stencil images is not supported. */
    public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
    /** {@code srcOffset} and {@code dstOffset} select the initial {@code x}, {@code y}, and {@code z} offsets in texels of the sub-regions of the source and destination image data. */
    public VkOffset3D srcOffset() { return nsrcOffset(address()); }
    /** see {@code srcSubresource} */
    public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
    /** see {@code srcOffset} */
    public VkOffset3D dstOffset() { return ndstOffset(address()); }
    /** the size in texels of the source image to resolve in {@code width}, {@code height} and {@code depth}. */
    public VkExtent3D extent() { return nextent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageResolve2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR} value to the {@link #sType} field. */
    public VkImageResolve2KHR sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageResolve2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #srcSubresource} field. */
    public VkImageResolve2KHR srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@link #srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2KHR srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #srcOffset} field. */
    public VkImageResolve2KHR srcOffset(VkOffset3D value) { nsrcOffset(address(), value); return this; }
    /** Passes the {@link #srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2KHR srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #dstSubresource} field. */
    public VkImageResolve2KHR dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@link #dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2KHR dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #dstOffset} field. */
    public VkImageResolve2KHR dstOffset(VkOffset3D value) { ndstOffset(address(), value); return this; }
    /** Passes the {@link #dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2KHR dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #extent} field. */
    public VkImageResolve2KHR extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@link #extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2KHR extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageResolve2KHR set(
        int sType,
        long pNext,
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D srcOffset,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D dstOffset,
        VkExtent3D extent
    ) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageResolve2KHR set(VkImageResolve2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageResolve2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageResolve2KHR malloc() {
        return wrap(VkImageResolve2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageResolve2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageResolve2KHR calloc() {
        return wrap(VkImageResolve2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageResolve2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageResolve2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageResolve2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageResolve2KHR} instance for the specified memory address. */
    public static VkImageResolve2KHR create(long address) {
        return wrap(VkImageResolve2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageResolve2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImageResolve2KHR.class, address);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageResolve2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageResolve2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkImageResolve2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageResolve2KHR malloc(MemoryStack stack) {
        return wrap(VkImageResolve2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageResolve2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageResolve2KHR calloc(MemoryStack stack) {
        return wrap(VkImageResolve2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageResolve2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageResolve2KHR.PNEXT); }
    /** Unsafe version of {@link #srcSubresource}. */
    public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageResolve2KHR.SRCSUBRESOURCE); }
    /** Unsafe version of {@link #srcOffset}. */
    public static VkOffset3D nsrcOffset(long struct) { return VkOffset3D.create(struct + VkImageResolve2KHR.SRCOFFSET); }
    /** Unsafe version of {@link #dstSubresource}. */
    public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageResolve2KHR.DSTSUBRESOURCE); }
    /** Unsafe version of {@link #dstOffset}. */
    public static VkOffset3D ndstOffset(long struct) { return VkOffset3D.create(struct + VkImageResolve2KHR.DSTOFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageResolve2KHR.EXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageResolve2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageResolve2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageResolve2KHR.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #srcOffset(VkOffset3D) srcOffset}. */
    public static void nsrcOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageResolve2KHR.SRCOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageResolve2KHR.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #dstOffset(VkOffset3D) dstOffset}. */
    public static void ndstOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageResolve2KHR.DSTOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageResolve2KHR.EXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageResolve2KHR} structs. */
    public static class Buffer extends StructBuffer<VkImageResolve2KHR, Buffer> implements NativeResource {

        private static final VkImageResolve2KHR ELEMENT_FACTORY = VkImageResolve2KHR.create(-1L);

        /**
         * Creates a new {@code VkImageResolve2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageResolve2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImageResolve2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageResolve2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageResolve2KHR.nsType(address()); }
        /** @return the value of the {@link VkImageResolve2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageResolve2KHR.npNext(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageResolve2KHR#srcSubresource} field. */
        public VkImageSubresourceLayers srcSubresource() { return VkImageResolve2KHR.nsrcSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkImageResolve2KHR#srcOffset} field. */
        public VkOffset3D srcOffset() { return VkImageResolve2KHR.nsrcOffset(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageResolve2KHR#dstSubresource} field. */
        public VkImageSubresourceLayers dstSubresource() { return VkImageResolve2KHR.ndstSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkImageResolve2KHR#dstOffset} field. */
        public VkOffset3D dstOffset() { return VkImageResolve2KHR.ndstOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkImageResolve2KHR#extent} field. */
        public VkExtent3D extent() { return VkImageResolve2KHR.nextent(address()); }

        /** Sets the specified value to the {@link VkImageResolve2KHR#sType} field. */
        public VkImageResolve2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageResolve2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR} value to the {@link VkImageResolve2KHR#sType} field. */
        public VkImageResolve2KHR.Buffer sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR); }
        /** Sets the specified value to the {@link VkImageResolve2KHR#pNext} field. */
        public VkImageResolve2KHR.Buffer pNext(@NativeType("void const *") long value) { VkImageResolve2KHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageResolve2KHR#srcSubresource} field. */
        public VkImageResolve2KHR.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageResolve2KHR.nsrcSubresource(address(), value); return this; }
        /** Passes the {@link VkImageResolve2KHR#srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2KHR.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkImageResolve2KHR#srcOffset} field. */
        public VkImageResolve2KHR.Buffer srcOffset(VkOffset3D value) { VkImageResolve2KHR.nsrcOffset(address(), value); return this; }
        /** Passes the {@link VkImageResolve2KHR#srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2KHR.Buffer srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageResolve2KHR#dstSubresource} field. */
        public VkImageResolve2KHR.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageResolve2KHR.ndstSubresource(address(), value); return this; }
        /** Passes the {@link VkImageResolve2KHR#dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2KHR.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkImageResolve2KHR#dstOffset} field. */
        public VkImageResolve2KHR.Buffer dstOffset(VkOffset3D value) { VkImageResolve2KHR.ndstOffset(address(), value); return this; }
        /** Passes the {@link VkImageResolve2KHR#dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2KHR.Buffer dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkImageResolve2KHR#extent} field. */
        public VkImageResolve2KHR.Buffer extent(VkExtent3D value) { VkImageResolve2KHR.nextent(address(), value); return this; }
        /** Passes the {@link VkImageResolve2KHR#extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2KHR.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    }

}